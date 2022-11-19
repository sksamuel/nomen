package com.sksamuel.nomen

import java.nio.ByteBuffer

@JvmInline
value class Base64(val value: String)

@JvmInline
value class PlainTextBase64(val value: Base64)

@JvmInline
value class CipherTextBase64(val value: Base64)

@JvmInline
value class PlainText(val value: ByteBuffer)

@JvmInline
value class CipherText(val value: ByteBuffer)
