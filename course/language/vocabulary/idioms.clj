(ns language.vocabulary.idioms)

;; # Idioms and common phrases

;; all of that and we still can't say anything useful...

;; let's [build something very simple](https://projecteuler.net/problem=1) together and see how that works out:

;;
;; _If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9._
;; 
;; _The sum of these multiples is 23._
;;
;; _Find the sum of all the multiples of 3 or 5 below 1000._
;;

;; using clojure's bare building blocks:
(defn euler1-loop-recur [m]
  (loop [n 0 ;; our looping index
         sum 0] ;; our accumulator
    (let [over? (>= n m) ;; our halt condition
          div-by-3? (= 0 (mod n 3))
          div-by-5? (= 0 (mod n 5))]
      (if over? sum
          (recur (inc n) ;; our recursive tail call!
                 (if (or div-by-3? div-by-5?)
                   (+ sum n)
                   sum))))))

;; yes that is a cool recursive way to do it, but is not pleasant at all...

;; you could try to be less of a micro-manager
;; 
;; and some more familiar
;; 
;; constructs with something like:
(defn euler1-for-macro [m]
  (apply +
    ;; sum everything in the collection that comes next
         (for [n (range 1 m)
    ;; this works as a python-style generator
               :when (or (= 0 (mod n 3))
                         (= 0 (mod n 5)))]
    ;; just yield a list of these n's that pass the `when` test
           n)))

;; that still screams of foreign accent...

;; not that there's anything wrong with it,
;; 
;; but if you want to talk like the natives,
;;
;; you could try something like:
(defn euler1-threading-sequences [m]
  ;; a pipeline!
  (->> m
       ;; an input collection, just data
       (range 1)
       ;; composable filter, it is just a function
       (filter #(or (= 0 (mod % 3))
                    (= 0 (mod % 5))))
       ;; a reduction, which internally uses a loop-recur 
       (reduce +)))

;; we could even go deeper into a cool feature called `transducers`, but that is a bit beyond what you need to get by on your first trip

;; there is still more to learn, so on to an exercise!

;; (assuming you already have the ~~whole setup~~ _work-book_)
