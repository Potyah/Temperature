package temperature_main;

import temperature_model.Model;
import temperature_view.FrameView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        FrameView view = new FrameView(model);

        SwingUtilities.invokeLater(view::start);
    }
}