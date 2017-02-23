{:user {:dependencies [[com.cemerick/piggieback "0.2.1"]
                       [figwheel-sidecar "0.5.0-1" :exclusions [commons-codec] ]]
        :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
        :repl {:init (do (require '[figwheel-sidecar.repl-api :refer [start-figwheel! cljs-repl]]))}}}
