(ns language.vocabulary.basic)

;; # Vocabulary

;; clojure's essential, basic vocabulary is pretty shockingly simple and short.
;; appart from ~~host interop~~ loan words:

;; ## `def`:

;; now clojure remembers it!
(def ine :something) 


;; ## 2) `if`:

(if true? :this :that)


;; ## 3) `do`:

;; chain forms/tasks/expressions, returning the last
(do (println :task1)
    (println :task2)
    (println :task3))

;; ## 4) `let`:

;; introduce local definitions
(let [x 1 y 2 z 3] (+ x y z))

;; ## 5) `quote`:

;; this prevents evaluation, so you can use your code as data!
(quote (i wont run))
`(this does the same)

;; ## 6) `var`:

;; with this you can get the namespaces symbol to anything passed!
(var name)

;; ## 7) `recur`:

;; since the jvm doesnt have tail call elimination,
;; 
;; clojure wont try optimize that under the hood, so recursion must be explicit and structured so the compiler can check it.
;;
;; cannot be used on it's own, like _ne_/_pas_ in french, please se bellow

;; ## 8) `loop`:

;; repeat stuff!
(loop [n 1]
  (println (str "for the " n "th time, we are not there yet!"))
  (recur (inc n)))


;; ## 9) `fn`:

;; lambdas!
(fn [x y] (- y x))

;; we can have arity based dispatch, 
;; 
;; delegate to another arity by name, 
;; 
;; or destructure
;; 
;; even use _rest_ pattern for varargs
(fn one-fn-to-rule-them-all
  ([] (one-fn-to-rule-them-all
       {:a "this works as"
        :b "default params"}))
  
  ([{:keys [a b c] :as m}] :yay-something)

  ([x y w & zs] :wow-much-things))

;; lambdas can be recursive on their own!
(fn [n]
  (if (zero? n)
    (println "launch!")
    (do (println "launching in" n "seconds...")
        (Thread/sleep 1000)
        (recur (dec n)))))

;; ## 10) `try`
;; and

;; ## 11) `throw`:

;; pretty standard, you can use plain java exceptions,
;; 
;; or create clojure-based ones
(try (/ 1 0)
     (catch Exception _
       (throw
        (ex-info "you created a blackhole"
                 {:cause "you are bad at maths"}))))

;; believe it or not, that's it! all the other things are just functions and macros built upon those, or directly deal with java/js apis/interop

;; also, you may notice those dont look special at all: they follow the same shape as a normal function/macro call!
;; lets jump into some [idioms](language.vocabulary.idioms.html) shall we?
;; 
