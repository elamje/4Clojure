(ns 27)

(true? (#(if (= (reverse %1) (reverse (reverse %1))) true false) "racecar")) ;; handles strings bc reverse breaks string up into char list
