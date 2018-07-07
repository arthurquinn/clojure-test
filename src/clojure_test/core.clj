(ns clojure-test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn my-fun [a b c]
  (str a " " b " " c))

(defn greet [name]
  (str "Hello, " name "."))

; test multi-arity functions
(defn messenger
  ([] (messenger "This is the default"))
  ([arg] (str "The message is: " arg)))



