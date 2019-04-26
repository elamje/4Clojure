(ns thirtynine)

(= (#(flatten (into [] (zipmap %1 %2))) [1 2] [3 4 5 6]) '(1 3 2 4))
;; => true

;; interleave
#(flatten (into [] (zipmap %1 %2)))

;; the only solution that ran was
#(flatten (map list %1 %2))
