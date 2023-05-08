module org.openjfx {
    requires javafx.controls;
    requires org.json.simple;
    requires javafx.base;
    
    opens org.openjfx.Pages.Inventori to javafx.base;
    exports org.openjfx;
    
}
