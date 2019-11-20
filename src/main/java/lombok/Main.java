package lombok;

import home_work.*; //pobiera wszystko z package
import javaBeans.RGB;

public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok("paulina", "123", "PC");
        // jest getter
        System.out.println(annotationsLombok.getLogin());
        // jest setter
        annotationsLombok.setLogin("XXX");
        // jest toString
        System.out.println(annotationsLombok);

        RGB rgb = new RGB(2,2,3);
        System.out.println(rgb);


    }

}
