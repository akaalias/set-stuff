(ns set-stuff.core)

(require '[clojure.java.io :as io]
         '[clojure.edn :as edn]
         '[clojure.set :as set])

(def my-ids (->> "my-ids.txt" 
                 io/resource slurp 
                 edn/read-string 
                 set))

(def found-ids (->> "found-ids.txt" 
                    io/resource 
                    slurp 
                    edn/read-string 
                    set))

(def my-intersection (set/intersection my-ids 
                                       found-ids))
 
