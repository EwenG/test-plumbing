(defproject ewen/cle-usb "0.1.0-SNAPSHOT"
  :description "test-plumbing"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :src-paths ["src"]
  :test-paths ["test"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2234"]
                 [prismatic/plumbing "0.3.1"]]
  :dev-dependencies [[lein-cljsbuild "1.0.3"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src-cljs"]
                        :compiler {
                                    :output-to "resources/public/cljs/test-plumbing.js"
                                    :output-dir "resources/public/cljs/"
                                    :optimizations :none
                                    :source-map true}}]})
