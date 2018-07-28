package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

/**
 * @category demo
 * @desc map view component	
 * @author Srikrishna Pothukuchi
 * @date 2018-07-28
 */
public class MapOne extends Application {

	private MapView mapView;

	@Override
	public void start(Stage stage) throws Exception {
		// create stack pane and application scene
		StackPane stackPane = new StackPane();
		Scene scene = new Scene(stackPane);
		// set title, size, and add scene to stage
		stage.setTitle("Sample Map Display");
		stage.setWidth(800);
		stage.setHeight(700);
		stage.setScene(scene);
		stage.show();

		// create a ArcGISMap with the a Basemap instance with an Imagery base layer
		ArcGISMap map = new ArcGISMap(Basemap.createImagery());
		// set the map to be displayed in this view
		mapView = new MapView();
		mapView.setMap(map);
		// add the map view to stack pane
		stackPane.getChildren().addAll(mapView);

	}

	/**
	 * Opens and runs application.
	 *
	 * @param args arguments passed to this application
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

}
