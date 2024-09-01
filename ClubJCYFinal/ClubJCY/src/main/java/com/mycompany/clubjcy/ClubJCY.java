/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clubjcy;

import app.config.MYSQLConnection;
import app.controller.ControllerInterface;
import app.controller.LoginController;

/**
 *
 * @author camil
 */
public class ClubJCY {
    public static void main(String[] args) {
        ControllerInterface controller = new LoginController();
		try {
			controller.session();
                        MYSQLConnection.getConnection();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
