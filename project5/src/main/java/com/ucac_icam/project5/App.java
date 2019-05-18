package com.ucac_icam.project5;

import java.sql.SQLException;

import org.project5.controller.ControllerFacade;

import model.ModelFacade;
import view.ViewFacade;


/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0

  */ 

public class App {
 /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
	
    public static void main( String[] args )
    {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }
}
