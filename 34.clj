(ns 34)

(= (#(take (- %2 %1) (iterate inc %1)) -2 2) '(-2 -1 0 1))
