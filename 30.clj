(ns thirty)

(= ((fn cf [x] (loop [x x prev nil result []] (if (empty? x)
                                                   result
                                                   (if (= (first x) prev)
                                                     (recur (rest x) (first x) result)
                                                     (recur (rest x) (first x) (conj result (first x)))))))
 [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
;; => true

;; Compress seq
(defn cf [x] (loop [x x prev nil result []] (if (empty? x)
                                                   result
                                                   (if (= (first x) prev)
                                                     (recur (rest x) (first x) result)
                                                     (recur (rest x) (first x) (conj result (first x)))))))

