package io.quarkiverse.web.bundler.runtime;

import java.util.Map;
import java.util.function.Supplier;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class WebBundlerBuildRecorder {

    public Supplier<?> createContext(Map<String, String> bundle) {
        return new Supplier<WebBundlerBuild>() {
            @Override
            public WebBundlerBuild get() {
                return () -> bundle;
            }
        };
    }

}
