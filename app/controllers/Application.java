package controllers;

import models.printer;
import models.showpro;
import play.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    public static printer printer;
    public Form<printer> printerForm = Form.form(printer.class);

    public static Result main(Html content) {
        return ok(main.render(content));
    }

    public static Result index() {
        return main(home.render());
    }




    public static Result main2(){
        return main(Promotion.render());
    }
    public static Result main3(){
        showpro P1 = new showpro();
        P1.setId("P001");
        P1.setName("H324");
        P1.setBrand("HP");
        P1.setPrice(3500);
        P1.setAmount(10);

        showpro P2 = new showpro("P002","KK234","CANON",7000,20);
        showpro P3 = new showpro("P003","KK","HP",6000,20);
        showpro P4 = new showpro("P004","KK","HP",3400,20);
        showpro P5 = new showpro("P005","KK","BROTHER",6400,20);
        showpro P6 = new showpro("P006","KK","BROTHER",5300,20);

        return main(showProducts.render(P1,P2,P3,P4,P5,P6));
    }

    public static Result form() {
        return main(form.render());
    }
    public static Result showform(){
        DynamicForm myForm = Form.form().bindFromRequest();
        double price,amount;
        String id,name,brand,Ptype,detail;
        id = myForm.get("pid");
        name = myForm.get("pname");
        brand = myForm.get("pbrane");
        Ptype = myForm.get("ptype");
        detail = myForm.get("pdetail");
        amount = Double.parseDouble( myForm.get("pamount"));
        price = Double.parseDouble( myForm.get("pprice"));
        printer = new printer(price,amount,id,name,brand,Ptype,detail);
        /*printer.setId(id);
        printer.setName(name);
        printer.setBrand(brand);
        printer.setType(Ptype);
        printer.setDetail(detail);
        printer.setAmount(amount);
        printer.setPrice(price); */
    return ok(p_post.render(printer));
    }

    public static Result printer_form_helper(){
        return ok();
    }
    public static Result printer_post_helper(){
        return ok();
    }
}
