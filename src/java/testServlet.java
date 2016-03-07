
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.classifiers.trees.RandomForest;
import weka.core.Debug;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

public class testServlet extends HttpServlet {

    public String result;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet testServlet</title>");
            out.println("</head>");
            out.println("<body>");
            int numFolds = 10;
            RandomForest rf = new RandomForest();
            // get data file
            loadData loadData = new loadData();
            Instances dataset = loadData.loadDataFile();
            // classification process
            dataset.setClassIndex(dataset.numAttributes() - 1);
            rf.setNumTrees(500);
            System.out.println(rf.getNumTrees()); //
            rf.buildClassifier(dataset);
            Evaluation evaluation = new Evaluation(dataset);
            System.out.println("num tree"); //
            evaluation.crossValidateModel(rf, dataset, numFolds, new Debug.Random(1));
            IBk classifier = new IBk(5);
            classifier.buildClassifier(dataset);
            /*
             * System.out.println(evaluation.toSummaryString("\nResults\n======\n",
             * true)); System.out.println(evaluation.toClassDetailsString());
             * System.out.println("Results For Class -1- "); System.out.println(
             * "Precision=  " + evaluation.precision(0)); System.out.println(
             * "Recall=  " + evaluation.recall(0)); System.out.println(
             * "F-measure=  " + evaluation.fMeasure(0)); System.out.println(
             * "Results For Class -2- "); System.out.println("Precision=  " +
             * evaluation.precision(1)); System.out.println("Recall=  " +
             * evaluation.recall(1)); System.out.println("F-measure=  " +
             * evaluation.fMeasure(1));
             */
            // predict new data that is not classified
            Instance instanceValue1 = new SparseInstance(9);
            instanceValue1.setValue(0, Integer.valueOf(request.getParameter("one")));
            instanceValue1.setValue(1, Integer.valueOf(request.getParameter("two")));
            instanceValue1.setValue(2, Integer.valueOf(request.getParameter("three")));
            instanceValue1.setValue(3, Integer.valueOf(request.getParameter("four")));
            instanceValue1.setValue(4, Integer.valueOf(request.getParameter("five")));
            instanceValue1.setValue(5, Integer.valueOf(request.getParameter("six")));
            instanceValue1.setValue(6, Integer.valueOf(request.getParameter("seven")));
            instanceValue1.setValue(7, Integer.valueOf(request.getParameter("eight")));
            instanceValue1.setValue(8, Integer.valueOf(request.getParameter("nine")));
            double[] prediction = classifier.distributionForInstance(instanceValue1);
            /*
             * prediction[0] is benign and prediction[0] is malignant
             */

            /*for (int i = 0; i < prediction.length; i++) {
             double d = prediction[i];
             System.out.println(d);
             }*/
            if (prediction[1] > prediction[0]) {
                result = "Malignant";
                System.out.println(result);
            } else {
                result = "Benign";
                System.out.println(result);
            }

            out.println(result);
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(testServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(testServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
