module codewithpuskaradhikari.example.learnjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens codewithpuskaradhikari.example.learnjava to javafx.fxml;
    exports codewithpuskaradhikari.example.learnjava;
}