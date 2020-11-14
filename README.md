# BuscarReemplazar
 
 De momento, no esta funcionando. Me lanza el siguiente error:
 
 Exception in Application constructor
Exception in thread "main" java.lang.RuntimeException: Unable to construct Application instance: class dad.javafx.buscarreemplazar.BuscarReemplazar
	at com.sun.javafx.application.LauncherImpl.launchApplication1(LauncherImpl.java:890)
	at com.sun.javafx.application.LauncherImpl.lambda$launchApplication$2(LauncherImpl.java:195)
	at java.base/java.lang.Thread.run(Thread.java:832)
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)
	at com.sun.javafx.application.LauncherImpl.lambda$launchApplication1$8(LauncherImpl.java:802)
	at com.sun.javafx.application.PlatformImpl.lambda$runAndWait$12(PlatformImpl.java:455)
	at com.sun.javafx.application.PlatformImpl.lambda$runLater$10(PlatformImpl.java:428)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:391)
	at com.sun.javafx.application.PlatformImpl.lambda$runLater$11(PlatformImpl.java:427)
	at com.sun.glass.ui.InvokeLaterDispatcher$Future.run(InvokeLaterDispatcher.java:96)
	at com.sun.glass.ui.win.WinApplication._runLoop(Native Method)
	at com.sun.glass.ui.win.WinApplication.lambda$runLoop$3(WinApplication.java:174)
	... 1 more
Caused by: java.lang.NullPointerException: Cannot invoke "javafx.scene.Node.getProperties()" because "<parameter1>" is null
	at javafx.scene.layout.Pane.setConstraint(Pane.java:111)
	at javafx.scene.layout.GridPane.setRowIndex(GridPane.java:299)
	at javafx.scene.layout.GridPane.setConstraints(GridPane.java:556)
	at javafx.scene.layout.GridPane.createRow(GridPane.java:669)
	at javafx.scene.layout.GridPane.addRow(GridPane.java:1017)
	at dad.javafx.buscarreemplazar.Vista.<init>(Vista.java:74)
	at dad.javafx.buscarreemplazar.Controlador.<init>(Controlador.java:5)
	at dad.javafx.buscarreemplazar.BuscarReemplazar.<init>(BuscarReemplazar.java:9)
	... 14 more
