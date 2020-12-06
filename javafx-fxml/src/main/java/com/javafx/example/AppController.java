package com.javafx.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class AppController {
	@FXML
	private TextField serverField;

	@FXML
	private TextField tenantField;

	@FXML
	private TextField namespaceField;

	@FXML
	private TextField userField;

	@FXML
	private TextField archiveField;

	@FXML
	private TextField importNameField;

	@FXML
	private TextField archivePasswordField;

	@FXML
	private PasswordField passwordField;

	@FXML
	private Button submitButton;

	private String tenantID;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		Window owner = submitButton.getScene().getWindow();

		int i = 0;
		String[] args = new String[14];
		args[i++] = "-g";
		args[i++] = serverField.getText();
		args[i++] = "-s";
		args[i++] = namespaceField.getText();
		args[i++] = "-u";
		args[i++] = userField.getText();
		args[i++] = "-p";
		args[i++] = passwordField.getText();
		args[i++] = "-a";
		args[i++] = archiveField.getText();
		args[i++] = "-i";
		args[i++] = archivePasswordField.getText();
		args[i++] = "-d";
		args[i] = importNameField.getText();

		System.out.println(String.join(" ", args));

		tenantID = tenantField.getText();

	}
}
