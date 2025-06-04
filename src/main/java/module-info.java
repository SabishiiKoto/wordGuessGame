module sabishiikoto.wordguess {
    requires javafx.controls;
    requires javafx.fxml;


    opens sabishiikoto.wordguess to javafx.fxml;
    exports sabishiikoto.wordguess;
}