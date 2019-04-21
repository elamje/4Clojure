(ns thirtythree)


;; replicate each element
 (defn rep-each [x times] (mapcat #(flatten (repeat times %)) (partition-by identity x)))
