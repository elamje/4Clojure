(ns 19)

; only works here(= (#(get % (dec (count %))) [1 2 3 4 5]) 5)

(= (#(nth % (dec (count %))) '(5 4 3)) 3)

