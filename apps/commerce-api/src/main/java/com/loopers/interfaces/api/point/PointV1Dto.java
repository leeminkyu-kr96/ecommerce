package com.loopers.interfaces.api.point;

import com.loopers.application.point.PointInfo;
import com.loopers.domain.user.UserModel;

public class PointV1Dto {
    public record PointResponse(Long id, UserModel user, int point) {
        public static PointResponse from(PointInfo info) {
            return new PointResponse(
                info.id(),
                info.user(),
                info.point()
            );
        }
    }
}
