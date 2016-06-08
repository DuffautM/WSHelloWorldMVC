package org.main;

import java.sql.SQLException;

import org.controller.Controller;
import org.model.Model;
import org.view.View;

public class main {

	public static void main (String[] args) throws SQLException{

		View view = new View();
		Model model = new Model();
		Controller controller= new Controller(view , model);
		controller.run();
		
	}

}
