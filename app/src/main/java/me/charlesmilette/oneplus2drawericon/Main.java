package me.charlesmilette.oneplus2drawericon;

import android.content.res.XModuleResources;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

public class Main implements IXposedHookZygoteInit, IXposedHookInitPackageResources {
    private static String MODULE_PATH = null;

    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
    }

    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.android.launcher3") != 0) {
            resparam.res.setReplacement("com.android.launcher3", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
            resparam.res.setReplacement("com.android.launcher3", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.android.launcher") != 0) {
            resparam.res.setReplacement("com.android.launcher", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
            resparam.res.setReplacement("com.android.launcher", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.cyanogenmod.trebuchet") != 0) {
            resparam.res.setReplacement("com.cyanogenmod.trebuchet", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
            resparam.res.setReplacement("com.cyanogenmod.trebuchet", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.anddoes.launcher") != 0) {
            resparam.res.setReplacement("com.anddoes.launcher", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
            resparam.res.setReplacement("com.anddoes.launcher", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.google.android.googlequicksearchbox") != 0) {
            resparam.res.setReplacement("com.google.android.googlequicksearchbox", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
            resparam.res.setReplacement("com.google.android.googlequicksearchbox", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.slim.slimlauncher") != 0) {
            resparam.res.setReplacement("com.slim.slimlauncher", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
            resparam.res.setReplacement("com.slim.slimlauncher", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.microsoft.launcher") != 0) {
            resparam.res.setReplacement("com.microsoft.launcher", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
        } else if (resparam.res.getIdentifier("ic_allapps", "drawable", "com.blackberry.blackberrylauncher") != 0) {
            resparam.res.setReplacement("com.blackberry.blackberrylauncher", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
        }
    }
}