<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="" content="">
        <title>Test Your Breast</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <img src="images/logoo.png" width="650" height="195" ></div>

                <div id="menu">
                    <ul>
                        <li><a href="">home page</a></li>
                        <li><a href="#form">test form</a></li>
                    </ul>
                </div>
            </div>
            <div id="contents">
                <div id="about">
                    <div id="paragraph">
                        <h2>How to Know if You Have Breast Cancer?</h2>
                        <pre>Affecting one in eight women, breast cancer is second only
to skin cancer in the number of cases of cancer diagnosed
each year.It is the second leading cause of cancer death,
following lung cancer.Although men have a lower risk than
women, they can also be diagnosed with breast cancer
A history of breast cancer in your family makes it
especially important to be proactive and be aware
of any changes in your breasts. Awareness and
early detection increase the success oftreatment and
survival rates.</pre>

                    </div>

                </div>
                <div id="taps">
                    <h3>9 features to predict one of benign and malignant categories:</h3>
                    <div class="tap">
                        <h4>clump thickness:</h4>
                        <p>Radius was computed by averaging the length of radial line segments from the center of the nuclear mass to each of the points of the nuclear border.</p>
                    </div>
                    <div class="tap">
                        <h4>uniformity of cell size:</h4>
                        <p>Perimeter was measured asthe distance around the nuclearborder.</p>

                    </div>
                    <div class="tap">
                        <h4>uniformity of cell shape:</h4>
                        <p>Area was measured by counting the number of pixels in the interior of the nuclear border and adding one-half of the pixels on the perimeter.</p>

                    </div>
                    <div class="tap">
                        <h4>marginal adhesion:</h4>
                        <p>Perimeter and area were combined to give a measure of the compactness of the cell nuclei using the following formula: perimeter2/area.</p>

                    </div>
                    <div class="tap">
                        <h4>single epithelial cell size:</h4>
                        <p>Smoothness was quantified by measuring the difference between the length of each radius and the mean length of adjacent radii.</p>

                    </div>
                    <div class="tap">
                        <h4>bare nuclei:</h4>
                        <p>Concavity was determined by measuring the size of any indentations in the nuclear border.</p>

                    </div>
                    <div class="tap">
                        <h4>bland chromatin:</h4>
                        <p>Concave points counted the number of points on the nuclear border that lie on an indentation.</p>

                    </div>
                    <div class="tap">
                        <h4>normal nucleoli and mitoses:</h4>
                        <p>Symmetry was measured by finding the relative difference in length between line segments perpendicular to and on either side of the major axis.</p>

                    </div>

                </div>
            </div>

            <div id="footer"></div>
            <div id="form">
                <form class="test" action="testServlet">
                    <h2>Test your breast >></h2>
                    <p>you can test your breast here by typing these values </p><br/>
                    <div id="input">
                        <table>
                            <tr>
                                <td>clump thickness:</td>    
                                <td> <input type="text" placeholder="type value from 1 to 10" name="one" required="required"/></td>
                            </tr>
                            <tr>
                                <td>uniformity of cell size:</td>
                                <td> <input type="text" placeholder="type value from 1 to 10" name="two" required="required"/></td>
                            </tr>
                            <tr>
                                <td>uniformity of cell shape</td>
                                <td><input type="text" placeholder="type value from 1 to 10" name="three" required="required"/></td>
                            </tr>

                            <tr>
                                <td>marginal adhesion</td>
                                <td><input type="text" placeholder="type value from 1 to 10" name="four" required="required"/></td>
                            </tr>
                            <tr>
                                <td>single epithelial cell size</td>
                                <td><input type="text" placeholder="type value from 1 to 10" name="five" required="required"/></td>
                            </tr>
                            <tr>
                                <td>bare nuclei</td>
                                <td><input type="text" placeholder="type value from 1 to 10" name="six" required="required"/></td>
                            </tr>
                            <tr>
                                <td>bland chromatin</td>
                                <td><input type="text" placeholder="type value from 1 to 10" name="seven" required="required"/></td>
                            </tr>
                            <tr>
                                <td>normal nucleoli and mitoses</td>
                                <td><input type="text" placeholder="type value from 1 to 10" name="eight" required="required"/></td>
                            </tr>
                            <tr>
                                <td>mitoses</td>
                                <td><input type="text" placeholder="type value from 1 to 10"  name="nine" required="required"/></td>
                            </tr>
                        </table>

                        <tr>
                            <td></td>
                            <td><input type="submit" value="Test"/></td>
                        </tr>
                    </div>
                </form>

            </div>
        </div>


    </body>
</html>
