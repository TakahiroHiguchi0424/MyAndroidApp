package com.example.pokemon.pokemonList

enum class ResultFailedType(val message: String) {
    CANNOT_CONNECT("ネットワークに接続できませんでした"),
    SERVER_ERROR("サーバーの不明なエラー"),
    CRASH("エラーが発生しました"),
    CANNOT_REGISTER("登録できませんでした"),
    CANNOT_LOGIN_RTM("メッセージ機能にエラーが発生しました。アプリを再起動してください"),
    WRONG_PASSWORD("パスワードが正しくありません"),
    VIDEO_CALL_SETTING_IS_UN_PERMITTED("相手のビデオ通話設定がOFFになっているか通話中です\nONにしてもらいましょう！"),
    VOICE_CALL_SETTING_IS_UN_PERMITTED("相手の音声通話設定がOFFになっているか通話中です\nONにしてもらいましょう！"),
    DURING_VIDEO_CALL("相手のビデオ通話設定がOFFになっているか通話中です\nONにしてもらいましょう!"),
    DURING_VOICE_CALL("相手の音声通話設定がOFFになっているか通話中です\nONにしてもらいましょう！"),
    // いいね
    FAVORITE_FAILURE("いいねに失敗しました\nお手数ですが再度お試しください"),
    ALREADY_FAVORED("既にいいね済みのユーザーです"),
    // お気に入り
    BOOK_MARK_FAILURE("お気に入り登録に失敗しました\nお手数ですが再度お試しください"),
    // お気に入り解除
    DELETE_BOOK_MARK_FAILURE("お気に入り登録に失敗しました\nお手数ですが再度お試しください"),
    // 掲示板
    SEND_BOARD_MESSAGE_FAILURE("掲示板投稿に失敗しました。再度お試しください"),
    SEND_BOARD_MESSAGE_FAILURE_TIME_LIMIT("5分以内の連続投稿はできません\nしばらく経ってから投稿してください"),
    // 画像購入
    PURCHASE_IMAGE_FAILURE("画像の購入処理に失敗しました"),
    PURCHASE_IMAGE_NOT_ENOUGH_POINT("ポイント不足により画像購入ができません"),
    // 動画購入
    PURCHASE_VIDEO_FAILURE("動画の購入処理に失敗しました"),
    PURCHASE_VIDEO_NOT_ENOUGH_POINT("ポイント不足により動画購入ができません"),
    // 画像送信
    SEND_IMAGE_FAILURE("画像の送信に失敗しました\n再度お試しください"),
    // 動画送信
    SEND_VIDEO_FAILURE("動画の送信に失敗しました\n再度お試しください"),
    // 画像削除
    DELETE_FAILURE("削除に失敗しました\nお手数ですが再度お試しください"),
    // ブロック済み
    BLOCKED("既にブロック済みユーザーです"),
    // 自分の投稿へのコメント
    COMMENT_MY_POST_FAILURE("自分の投稿へのコメントはできません"),
    // タイムラインコメント時のポイント不足
    ADD_TIMELINE_COMMENT_NOT_ENOUGH_POINT("ポイント不足によりコメントできません"),
}