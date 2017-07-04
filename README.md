# GlobalToast

[![](https://jitpack.io/v/by-syk/GlobalToast.svg)](https://jitpack.io/#by-syk/GlobalToast)
[![](https://img.shields.io/badge/Download%20aar-1.2.1-brightgreen.svg)](out/globaltoast-1.2.1.aar)

A simple library for using `android.widget.Toast` conveniently.

Features:

+ Just one Toast instance is kept


### Adding to your project

This library is available through [**JitPack.io**](https://jitpack.io/).

**Step 1.** Add it in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency:

```
dependencies {
    compile 'com.github.by-syk:GlobalToast:1.2.1'
}
```


### How to use

```java
GlobalToast.show(context, "Hello, world!");
GlobalToast.showLong(context, "Hello, world!");
GlobalToast.show(context, R.string.hello);
GlobalToast.copyAndShow(context, "Hello, world!");
```


### Demo APP

[Get it](out/GlobalToastSample.apk)


### License

    Copyright 2017 By_syk

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


*Copyright &#169; 2017 By_syk. All rights reserved.*