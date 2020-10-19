object Dependencies {

    object ClassPaths {
        const val gradleClasspath = "com.android.tools.build:gradle:${Versions.gradleVersion}"
        const val kotlinGradlePluginClasspath =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
        const val dokkaPluginClasspath =
            "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokkaVeresion}"
        const val jacoco = "com.vanniktech:gradle-android-junit-jacoco-plugin:${Versions.jacoco}"
    }

    object Plugins {
        const val ANDROID_APPLICATION = "com.android.application"
        const val ANDROID_LIBRARY = "com.android.library"
        const val GOOGLE_SERVICES = "com.google.gms.google-services"
        const val FIREBASE_PREF = "com.google.firebase.firebase-perf"
        const val FABRIC_IO = "io.fabric"
        const val KOTLIN_ANDROID = "kotlin-android"
        const val KOTLIN_KAPT = "kotlin-kapt"
        const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
        const val DETEKT = "io.gitlab.arturbosch.detekt"
        const val JACOCO = "com.vanniktech.android.junit.jacoco"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val annotationProcessor = "androidx.annotation:annotation:1.0.0"
        const val annotationCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object Gson {
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object Kotlin {
        const val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    }

    object Retrofit2 {
        const val adapterRxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
        const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    }

    object OkHttp3 {
        const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.retrofit_log}"
        const val okHttp3 = "com.squareup.okhttp3:okhttp:3.12.1"
    }
    object AndroidX {
        const val fragment = "androidx.fragment:fragment:${Versions.androidx}"
        const val annotation = "androidx.annotation:annotation:${Versions.androidx}"
        const val core = "androidx.core:core:${Versions.androidx}"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.androidx_112}"
        const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
        const val support_recyclerview_v7 =
            "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.androidx_100beta01}"
        const val vectordrawable =
            "androidx.vectordrawable:vectordrawable:${Versions.androidx_100beta01}"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
        const val annotationProcessor = "androidx.room:room-compiler:${Versions.room}"
    }

    object RxJava {
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
        const val rxjava2 = "io.reactivex.rxjava2:rxjava:${Versions.rx}"
        const val rxrelay2 = "com.jakewharton.rxrelay2:rxrelay:${Versions.rxRelay}"
        const val rxBinding = "com.jakewharton.rxbinding3:rxbinding:${Versions.rxBinding}"
    }

    object Dagger {
        const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
        const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger2}"
        const val daggerAndroidSupport =
            "com.google.dagger:dagger-android-support:${Versions.dagger2}"
        const val processor = "com.google.dagger:dagger-android-processor:${Versions.dagger2}"
        const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
    }

    object Test {
        const val test_junit = "junit:junit:${Versions.junit}"
        const val android_test_espresso_core =
            "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val android_test_room = "android.arch.persistence.room:testing:${Versions.room}"
        const val testing_core_testing = "android.arch.core:core-testing:${Versions.lifecycle}"
        const val android_test_rules = "androidx.test:rules:${Versions.rules}"
        const val android_test_runner = "androidx.test:runner:${Versions.runner}"
        const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
        const val assert_j = "org.assertj:assertj-core:${Versions.assertJVersion}"
        const val roboElectric = "org.robolectric:robolectric:${Versions.roboElectric}"
    }

    object Lifecycle {
        const val extension = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
        const val annotation_compliler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"

        // ViewModel and LiveData
        const val lifeCycleExtension =
            "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleVersion}"
    }

    object Lint {
        const val detekt = "io.gitlab.arturbosch.detekt:detekt-cli:${Versions.detektVersion}"
        const val ktLint = "com.pinterest:ktlint:${Versions.ktLint}"
    }

}