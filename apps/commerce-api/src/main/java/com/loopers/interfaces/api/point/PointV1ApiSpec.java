package com.loopers.interfaces.api.point;

import com.loopers.interfaces.api.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "User V1 API", description = "Loopers 유저 API 입니다.")
public interface PointV1ApiSpec {

    @Operation(
        summary = "유저 중복 조회",
        description = "ID로 유저를 중복 조회합니다."
    )
    ApiResponse<PointV1Dto.PointResponse> chkDuplicateUserId(
        @Schema(name = "유저 ID", description = "중복 조회할 유저의 ID")
        String userId
    );

    @Operation(
        summary = "유저 회원 가입",
        description = "유저를 회원 가입합니다."
    )
    ApiResponse<PointV1Dto.PointResponse> signup(
        @Schema(name = "유저 정보", description = "회원 가입할 유저의 정보")
        PointV1Dto.PointResponse pointResponse
    );
}
