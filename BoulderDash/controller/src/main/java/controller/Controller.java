package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

public final class Controller implements IController {

	private IView view;

	private IModel model;

	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	public void instruction() {
		this.view.printMessage(
				"Appuyer sur les touches 'E', 'F', 'D' ou 'I', pour afficher Hello world dans la langue d votre choix.");
	}

	private void setView(final IView pview) {
		this.view = pview;
	}

	private void setModel(final IModel model) {
		this.model = model;
	}

	public void orderPerform(final ControllerOrder controllerOrder) {
			this.model.loadMap("GB");
		//	instruction();
			
			
		}
	

	@Override
	public void control() {
		// TODO Auto-generated method stub
		
	}
	
	
}
