/*
 * Copyright (C) 2022 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.aperture

import android.os.Bundle
import org.lineageos.aperture.utils.CameraMode

@androidx.camera.camera2.interop.ExperimentalCamera2Interop
@androidx.camera.core.ExperimentalZeroShutterLag
@androidx.camera.view.video.ExperimentalVideo
class QrScannerActivity : CameraActivity() {
    override fun overrideInitialCameraMode() = CameraMode.QR
}
