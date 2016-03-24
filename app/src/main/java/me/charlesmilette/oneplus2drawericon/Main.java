package me.charlesmilette.oneplus2drawericon;

import android.content.res.XModuleResources;

import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;

public class Main implements IXposedHookZygoteInit, IXposedHookInitPackageResources{
    private static String MODULE_PATH = null;

    @Override
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
    }

    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        resparam.res.setReplacement("com.android.launcher3", "drawable", "ic_allapps", modRes.fwd(R.drawable.drawer));
        resparam.res.setReplacement("com.android.launcher3", "drawable", "ic_allapps_pressed", modRes.fwd(R.drawable.drawer_pressed));
    }
}