(ns language.grammar.syntax)

;; ## Syntax~~tree~~ and Sentence structure

;; every programming language goes into at least one step between reading
;; 
;; and actually running where the program or funcitonality is represented by an AST.
;; 
;; such structure is usually very different from the language itself, 
;; 
;; but on lisps, it is pretty close, when not the same!

;; just as german puts the verb always on the second position,
;; 
;; in clojure we always put it at the beginning:

;; `println` is the verb, is what we are doing,
;; rest is just args
;; 
;; commas are whitespace in clojure
;; but you can add if you feel it makes it easier to read
(println "some", "other", [:args, not, :care])

;; `*` (times/multiplication/product) is the verb, rest a bunch of numbers
(* 2 3 4 5)

;; the square brackets are like a sugar for the `vector` function
(= (vector 1 2 3) [1 2 3])

;; so it gets pretty consistent and easy to spot patterns!

;; definitons are not special syntax
(def age 21)
(def cats ["🐈" "🐈‍⬛"])
(defn pet [cat] "😻")

;; `if` behaves as a funciton of 3 args, no special syntax
(if (> 18 age) :cant-drink, :get-me-a-beer!)

;; `for` is just a macro, takes 2 args
;; (a vector with even number of elements, and a list)
;; and does what you expect it to
(for [cat cats] (pet cat))

;; though you would more commonly see:
(map pet cats)

;; now that we kinda know which part does what, time to learn some [vocabulary](language.vocabulary.basic.html)!