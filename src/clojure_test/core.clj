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

; test variadic arg functions
(defn multi-greet [greeting & persons]
  (apply println greeting persons))

; immediately invoke anonymous function
( (fn [message] (println message)) "Hello!" )

; bind anonymous function to farewell using def
(def farewell (fn [name] (str "Goodbye," name)))

(defn extra-messenger [msg]
  (let [a 7
        b 5
        c (clojure.string/capitalize msg)]
    (println a b c)))







