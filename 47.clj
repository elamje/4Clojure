(ns fortyseven)

(contains? #{4 5 6} 4)

(contains? [1 1 1 1 1] 4) ;; contains checks if INDEX exists for vectors and lists, not if the value is contained

(not (contains? [1 2 4] 4)) ;; index dne here
