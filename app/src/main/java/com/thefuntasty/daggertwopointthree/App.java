package com.thefuntasty.daggertwopointthree;

import android.app.Application;
import android.content.Context;

public class App extends Application {

	private ApplicationComponent applicationComponent;

	public static App get(Context context) {
		return (App) context.getApplicationContext();
	}

	public ApplicationComponent getComponent() {
		if (applicationComponent == null) {
			applicationComponent = DaggerApplicationComponent.builder()
					.applicationModule(new ApplicationModule(this))
					.build();
		}
		return applicationComponent;
	}
}
