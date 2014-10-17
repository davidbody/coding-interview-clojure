(ns coding-interview.core-test
  (:require [clojure.test :refer :all]
            [coding-interview.core :refer :all]))

(deftest test-1
  (testing "aaab, 2 => aab"
    (is (= (remove-extra-consecutive "aaab" 2) "aab"))))

(deftest test-2
  (testing "aabb, 1 => ab"
    (is (= (remove-extra-consecutive "aabb" 1) "ab"))))

(deftest test-3
  (testing "aabbaa, 1 => aba"
    (is (= (remove-extra-consecutive "aabbaa" 1) "aba"))))
