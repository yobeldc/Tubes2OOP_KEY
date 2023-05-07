package org.openjfx.Pages.Sales;

import org.openjfx.App;
import org.openjfx.Pages.Member.MemberPage;

public class SalesPageController {

    public static void showSalesPage() {
        App.getRoot().setCenter(new SalesPage());
    }
}
