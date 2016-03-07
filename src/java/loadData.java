
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import weka.core.Instances;
import weka.core.converters.ArffSaver;

public class loadData {

    public Instances loadDataFile() throws FileNotFoundException, IOException {
        /* Start loading data file */

        Instances dataset = new Instances(new BufferedReader(new FileReader("/home/khalid/NetBeansProjects/TestYourBreast/arffData.arff")));
        System.out.println(dataset.toSummaryString());
        ArffSaver saver = new ArffSaver();
        saver.setInstances(dataset);
        saver.setFile(new File("/home/khalid/NetBeansProjects/TestYourBreast/newArffData.arff"));
        saver.writeBatch();
        return dataset;
        /* End loading data file */
    }
}
