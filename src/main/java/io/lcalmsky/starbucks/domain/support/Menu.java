package io.lcalmsky.starbucks.domain.support;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

public enum Menu {
    ;

    @RequiredArgsConstructor
    @Getter
    public enum ColdBrew {
        DOLCE_COLD_BREW("돌체 콜드 브루", 5800),
        COLD_FOAM_COLD_BREW("콜드 폼 콜드 브루", 5800),
        VANILLA_CREAM_COLD_BREW("바닐라 크림 콜드 브루", 5800),
        COLD_BREW("콜드 브루", 5800),
        NITRO_VANILLA_CREAM("나이트로 바닐라 크림", 5800),
        NITRO_CHOCOLAT_CLOUD("나이트로 쇼콜라 클라우드", 5800),
        NITRO_COLD_BREW("나이트로 콜드 브루", 5800),
        ;

        private final String name;
        private final int price;

        public int getPriceBySize(Size size) {
            return getPrice() + Optional.ofNullable(size)
                    .map(Enum::ordinal)
                    .map(i -> (i - 1) * 500)
                    .orElse(0);
        }
    }
}
