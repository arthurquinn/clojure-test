(ns clojure-test.functions-test)

(defn hello1 [] (print "Hello1"))

(def hello2 (fn [] (print "Hello2")))

(def hello3 #(print "Hello3"))

(defn greeting
  ([] (str "Hello, World!"))
  ([x] (str "Hello, " x "!"))
  ([x y] (str x ", " y "!")))

; throw a compiler exception if any of these expressions evaluate to false
(assert (= "Hello, World!" (greeting)))
(assert (= "Hello, Clojure!" (greeting "Clojure")))
(assert (= "Good morning, Clojure!" (greeting "Good morning" "Clojure")))

(defn do-nothing [x] x)

(defn always-thing [& x] :thing)

(defn make-thingy [x] (fn [& args] x))

; test out make-thingy
(let [n (rand-int Integer/MAX_VALUE)
      f (make-thingy n)]
  (assert (= n (f)))
  (assert (= n (f :foo)))
  (assert (= n (apply f :foo (range)))))
