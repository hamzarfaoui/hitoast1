Installation:

Step 1.

allprojects {

repositories {
...

maven { url 'https://jitpack.io' }

}

}

Step 2. 

Add the dependency

dependencies {

implementation 'com.github.hamzarfaoui:hitoast1:1.0'

}

Usage:

HiToast hiToast = new HiToast();

hiToast.love("Your Message Here",MainActivity.this,Toast.LENGTH_LONG);

Available Toasts:

hiToast.love

hiToast.angry

hiToast.hi

hiToast.danger

hiToast.info

hiToast.primary

hiToast.success
