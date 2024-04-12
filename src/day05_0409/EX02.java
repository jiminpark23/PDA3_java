package day05_0409;

// 리팩토링
public class EX02 {
    int _quantity;
    int _itemPrice;
    int discountLevel;

    EX02 (int _quantity, int _itemPrice) {
        this._quantity = _quantity;
        this._itemPrice = _itemPrice;
    }

    int getDiscountLevel() {
        return discountLevel;
    }

    double getDiscountPrice(int basePrice, int discountLevel) {
        // discountLevel 스위치
        // 퍼센트율
        return basePrice * 0.8;
    }

    void method() {
//        int basePrice = _quantity * _itemPrice;
//        discountLevel = getDiscountLevel();
//
//        double finalPrice
//                = getDiscountPrice(basePrice, discountLevel);

        double finalPrice = _quantity * _itemPrice * discountLevel;
        System.out.println("최종 금액은 " + finalPrice + "달러입니다.");

    }

}

