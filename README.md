# OnePlus 2 Drawer Icon

This little Xposed modules makes the app drawer's icon in your launcher look like the one from the OnePlus 2's stock ROM, OxygenOS.

Users of custom ROM might be interested in this to restore the icon from stock.

Technically, it should work with any launcher based on the stock one, on any version starting from Ice Cream Sandwich.

If anything doesn't works, you're welcome to file an issue. I'll make sure to fulfill any request well detailled (version of Android and name of launcher used)

## Confirmed working on

- Trebuchet
- Launcher2
- Launcher3
- Apex (You will have to set your app drawer icon as `Lollipop` under `Apex settings` > `Drawer settings` > `Drawer icon style`)
- Google Now Launcher
- SlimLauncher

## Screenshots

![Trebuchet on KitKat](https://i.imgur.com/kSDLW3L.png) ![Trebuchet on Jelly Bean](https://i.imgur.com/I5nTy1y.png)

## Links

[Xposed Module Repository](http://repo.xposed.info/module/me.charlesmilette.oneplus2drawericon)

[XDA Developers Forum Thread](http://forum.xda-developers.com/xposed/modules/xposed-oneplus-2-drawer-icon-t3344112)

## Compiling

First, you need to setup a compiling environment:
```
git clone https://github.com/charlesmilette/OnePlus2DrawerIcon.git
cd OnePlus2DrawerIcon
gradlew
```

If everything runs fine, you should see a prompt like this:
```
Incremental java compilation is an incubating feature.
:help

Welcome to Gradle 2.10.

To run a build, run gradlew <task> ...

To see a list of available tasks, run gradlew tasks

To see a list of command-line options, run gradlew --help

To see more detail about a task, run gradlew help --task <task>

BUILD SUCCESSFUL

Total time: 40.076 secs
```
If you don't see that, you'll be able to fix the errors that occured by following instructions in the text printed.

To compile a usable `.apk` file, run `gradlew assembleRelease`

If you want to sign the `.apk`, use the solution described [here](http://stackoverflow.com/a/21020469/2884575).

The `.apk` will be in `<repo>\app\build\outputs\apk\app-release.apk`

## Installing

Note: If you already had a version from the Xposed Repo installed, you'll have to uninstall it first. If not, Android will refuse to install your custom compilation.

If you have `adb` usable, you can use `adb install -r <apk>`

If not, you need to enable sideloading by checking `Settings > Security > Device administration > Unknown sources`. Use your favorite way of sending a file to your Android device. Then, from a file explorer, open the file.

If you only want to use the module and not build it, you can install it [here](http://forum.xda-developers.com/xposed/modules/xposed-oneplus-2-drawer-icon-t3344112).

## Uninstalling

...