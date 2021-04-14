(ns language.counting)

;; checking math still works
(= (+ 2 2) 4)

;; these bellow are all the same!

;; addition is associative
(+ 1 (+ 2 (+ 3 (+ 4 5))))

;; and clojure knows this
(+ 1 2 3 4 5)

;; `apply` macro can use a collection as args to a function
;; like a `splice` in some languages
(apply + [1 2 3 4 5])

;; oh functional programmers do love themselves some reductions!
(reduce + [1 2 3 4 5])

;; and you can generate the sequence too instead of write it out
(reduce + (range 1 6))

;; this is basically the trimmed down implementation
;; of what actually happens above
(loop [[x & xs] (range 1 6) sum 0]
    (if (empty? xs) sum
        (recur xs (+ sum x))))

;; now time for some [meta](language.general.html)