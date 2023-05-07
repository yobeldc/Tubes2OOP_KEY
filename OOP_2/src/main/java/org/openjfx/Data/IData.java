package org.openjfx.Data;
import java.util.List;
import org.openjfx.Data.Data;

public interface IData< ? extends Data> {
    List<? extends Data> getListOfObjects();
}
