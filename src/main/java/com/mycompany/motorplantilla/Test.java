/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorplantilla;

/**
 *
 * @author Labing 201
 */
import freemarker.template.*;
import java.util.*;
import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {

        /* ------------------------------------------------------------------------ */
 /* You should do this ONLY ONCE in the whole application life-cycle:        */

 /* Create and adjust the configuration singleton */
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_27);
        cfg.setDirectoryForTemplateLoading(new File("plantillas/"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);

        /* ------------------------------------------------------------------------ */
 /* You usually do these for MULTIPLE TIMES in the application life-cycle:   */

 /* Create a data-model */
        List<Tabla> tablas = new ArrayList<>();
        Tabla t1 = new Tabla("Persona", 0);
        t1.addColumna("nombre");
        t1.addColumna("apellido");
        Tabla t2 = new Tabla("Equipo", 1);
        t2.addColumna("nombre");
        
        tablas.add(t1);
        tablas.add(t2);
        
        Map root = new HashMap();
        root.put("tablas", tablas);

        /* Get the template (uses cache internally) */
        Template temp = cfg.getTemplate("test.ftlh");

        /* Merge data-model with template */
        FileOutputStream salida = new FileOutputStream(new File("bd.sql"));
        Writer out = new OutputStreamWriter(salida);
        temp.process(root, out);

    }
}
