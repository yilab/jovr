package com.oculusvr.capi;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;

/**
 * JNA Wrapper for library <b>com.oculusvr.capi</b><br>
 * This file was autogenerated by <a
 * href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few
 * opensource projects.</a>.<br>
 * For help, please visit <a
 * href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a
 * href="http://jna.dev.java.net/">JNA</a>.
 */
public interface OvrLibrary extends Library {
  public static final String JNA_LIBRARY_NAME = "OVR_C";
  public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(OvrLibrary.JNA_LIBRARY_NAME);
  public static final OvrLibrary INSTANCE = (OvrLibrary) Native.loadLibrary(OvrLibrary.JNA_LIBRARY_NAME,
      OvrLibrary.class);

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrHmdType {
    /** <i>native declaration : OVR_CAPI.h:401</i> */
    public static final int ovrHmd_None = 0;
    /** <i>native declaration : OVR_CAPI.h:402</i> */
    public static final int ovrHmd_DK1 = 3;
    /** <i>native declaration : OVR_CAPI.h:403</i> */
    public static final int ovrHmd_DKHD = 4;
    /** <i>native declaration : OVR_CAPI.h:404</i> */
    public static final int ovrHmd_CrystalCoveProto = 5;
    /** <i>native declaration : OVR_CAPI.h:405</i> */
    public static final int ovrHmd_DK2 = 6;
    /**
     * Some HMD other then the one in the enumeration.<br>
     * <i>native declaration : OVR_CAPI.h:406</i>
     */
    public static final int ovrHmd_Other = 7;
  };

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrHmdCaps {
    /**
     * This HMD exists (as opposed to being unplugged).<br>
     * <i>native declaration : OVR_CAPI.h:414</i>
     */
    public static final int ovrHmdCap_Present = 0x0001;
    /**
     * HMD and is sensor is available for use<br>
     * <i>native declaration : OVR_CAPI.h:415</i>
     */
    public static final int ovrHmdCap_Available = 0x0002;
    /**
     * Supports low persistence mode.<br>
     * <i>native declaration : OVR_CAPI.h:428</i>
     */
    public static final int ovrHmdCap_LowPersistence = 0x0080;
    /**
     * Supports pixel reading for continuous latency testing.<br>
     * <i>native declaration : OVR_CAPI.h:429</i>
     */
    public static final int ovrHmdCap_LatencyTest = 0x0100;
    /**
     * Adjust prediction dynamically based on DK2 Latency.<br>
     * <i>native declaration : OVR_CAPI.h:430</i>
     */
    public static final int ovrHmdCap_DynamicPrediction = 0x0200;
    /** <i>native declaration : OVR_CAPI.h:432</i> */
    public static final int ovrHmdCap_NoVSync = 0x1000;
    /** <i>native declaration : OVR_CAPI.h:433</i> */
    public static final int ovrHmdCap_NoRestore = 0x4000;
    /** <i>native declaration : OVR_CAPI.h:436</i> */
    public static final int ovrHmdCap_Writable_Mask = 0x1380;
  };

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrSensorCaps {
    /**
     * Supports orientation tracking (IMU).<br>
     * <i>native declaration : OVR_CAPI.h:444</i>
     */
    public static final int ovrSensorCap_Orientation = 0x0010;
    /**
     * Supports yaw correction through magnetometer or other means.<br>
     * <i>native declaration : OVR_CAPI.h:445</i>
     */
    public static final int ovrSensorCap_YawCorrection = 0x0020;
    /**
     * Supports positional tracking.<br>
     * <i>native declaration : OVR_CAPI.h:446</i>
     */
    public static final int ovrSensorCap_Position = 0x0040;
  };

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrDistortionCaps {
    /**
     * Supports chromatic aberration correction.<br>
     * <i>native declaration : OVR_CAPI.h:454</i>
     */
    public static final int ovrDistortionCap_Chromatic = 0x01;
    /**
     * Supports timewarp.<br>
     * <i>native declaration : OVR_CAPI.h:455</i>
     */
    public static final int ovrDistortionCap_TimeWarp = 0x02;
    /**
     * Disables SDK side swapbuffers / present
     */
    public static final int ovrDistortionCap_NoSwapBuffers = 0x04;
    /**
     * Supports vignetting around the edges of the view.<br>
     * <i>native declaration : OVR_CAPI.h:456</i>
     */
    public static final int ovrDistortionCap_Vignette = 0x08;
  };

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrEyeType {
    /** <i>native declaration : OVR_CAPI.h:465</i> */
    public static final int ovrEye_Left = 0;
    /** <i>native declaration : OVR_CAPI.h:466</i> */
    public static final int ovrEye_Right = 1;
    /** <i>native declaration : OVR_CAPI.h:467</i> */
    public static final int ovrEye_Count = 2;
  };

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrStatusBits {
    /**
     * Orientation is currently tracked (connected and in use).<br>
     * <i>native declaration : OVR_CAPI.h:530</i>
     */
    public static final int ovrStatus_OrientationTracked = 0x0001;
    /**
     * Position is currently tracked (FALSE if out of range).<br>
     * <i>native declaration : OVR_CAPI.h:531</i>
     */
    public static final int ovrStatus_PositionTracked = 0x0002;
    /**
     * Position tracking HW is connected.<br>
     * <i>native declaration : OVR_CAPI.h:532</i>
     */
    public static final int ovrStatus_PositionConnected = 0x0020;
    /**
     * HMD Display is available & connected.<br>
     * <i>native declaration : OVR_CAPI.h:533</i>
     */
    public static final int ovrStatus_HmdConnected = 0x0080;
  };

  /**
   * <i>native declaration : OVR_CAPI.h</i><br>
   * enum values
   */
  public static interface ovrRenderAPIType {
    /** <i>native declaration : OVR_CAPI.h:629</i> */
    public static final int ovrRenderAPI_None = 0;
    /** <i>native declaration : OVR_CAPI.h:630</i> */
    public static final int ovrRenderAPI_OpenGL = 1;
    /** <i>native declaration : OVR_CAPI.h:631</i> */
    public static final int ovrRenderAPI_Android_GLES = 2;
    /** <i>native declaration : OVR_CAPI.h:632</i> */
    public static final int ovrRenderAPI_D3D9 = 3;
    /** <i>native declaration : OVR_CAPI.h:633</i> */
    public static final int ovrRenderAPI_D3D10 = 4;
    /** <i>native declaration : OVR_CAPI.h:634</i> */
    public static final int ovrRenderAPI_D3D11 = 5;
    /** <i>native declaration : OVR_CAPI.h:635</i> */
    public static final int ovrRenderAPI_Count = 6;
  };

  public static final String OVR_KEY_EYE_HEIGHT = "EyeHeight";
  public static final String OVR_KEY_NAME = "Name";
  public static final String OVR_KEY_GENDER = "Gender";
  public static final String OVR_KEY_PLAYER_HEIGHT = "PlayerHeight";
  public static final String OVR_KEY_NECK_TO_EYE_HORIZONTAL = "NeckEyeHori";
  public static final String OVR_KEY_USER = "User";
  public static final String OVR_KEY_IPD = "IPD";

  public static final String OVR_DEFAULT_GENDER = "Male";
  public static final float OVR_DEFAULT_NECK_TO_EYE_VERTICAL = 0.12f;
  public static final float OVR_DEFAULT_PLAYER_HEIGHT = 1.778f;
  public static final float OVR_DEFAULT_EYE_HEIGHT = 1.675f;
  public static final float OVR_DEFAULT_IPD = 0.064f;
  public static final float OVR_DEFAULT_NECK_TO_EYE_HORIZONTAL = 0.12f;

  /**
   * No other functions calls are allowed before ovr_Initialize succeeds or
   * after ovr_Shutdown.<br>
   * Original signature : <code>ovrBool ovr_Initialize()</code><br>
   * <i>native declaration : OVR_CAPI.h:703</i>
   */
  byte ovr_Initialize();

  /**
   * Original signature : <code>void ovr_Shutdown()</code><br>
   * <i>native declaration : OVR_CAPI.h:704</i>
   */
  void ovr_Shutdown();

  /**
   * Users can get information about each HMD by calling ovrHmd_Create with an
   * index.<br>
   * Original signature : <code>int ovrHmd_Detect()</code><br>
   * <i>native declaration : OVR_CAPI.h:709</i>
   */
  int ovrHmd_Detect();

  /**
   * If not null, returned handle must be freed with ovrHmd_Destroy.<br>
   * Original signature : <code>ovrHmd ovrHmd_Create(int)</code><br>
   * <i>native declaration : OVR_CAPI.h:715</i>
   */
  Hmd ovrHmd_Create(int index);

  /**
   * Original signature : <code>void ovrHmd_Destroy(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:716</i>
   */
  void ovrHmd_Destroy(Hmd hmd);

  /**
   * but may be used to debug some of the related rendering.<br>
   * Original signature : <code>ovrHmd ovrHmd_CreateDebug(ovrHmdType)</code><br>
   * <i>native declaration : OVR_CAPI.h:720</i>
   */
  Hmd ovrHmd_CreateDebug(int type);

  /**
   * Pass null hmd to get global error (for create, etc).<br>
   * Original signature : <code>char* ovrHmd_GetLastError(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:726</i>
   */
  String ovrHmd_GetLastError(Hmd hmd);

  /**
   * capabilities are available.<br>
   * Original signature : <code>int ovrHmd_GetEnabledCaps(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:734</i>
   */
  int ovrHmd_GetEnabledCaps(Hmd hmd);

  /**
   * such as ovrHmd_LowPersistance.<br>
   * Original signature :
   * <code>void ovrHmd_SetEnabledCaps(ovrHmd, unsigned int)</code><br>
   * <i>native declaration : OVR_CAPI.h:738</i>
   */
  void ovrHmd_SetEnabledCaps(Hmd hmd, int hmdCaps);

  /**
   * supportedSensorCaps.<br>
   * Original signature :
   * <code>ovrBool ovrHmd_StartSensor(ovrHmd, unsigned int, unsigned int)</code><br>
   * <i>native declaration : OVR_CAPI.h:754</i>
   */
  byte ovrHmd_StartSensor(Hmd hmd, int supportedSensorCaps, int requiredSensorCaps);

  /**
   * Stops sensor sampling, shutting down internal resources.<br>
   * Original signature : <code>void ovrHmd_StopSensor(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:757</i>
   */
  void ovrHmd_StopSensor(Hmd hmd);

  /**
   * Resets sensor orientation.<br>
   * Original signature : <code>void ovrHmd_ResetSensor(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:759</i>
   */
  void ovrHmd_ResetSensor(Hmd hmd);

  /**
   * This may also be used for more refined timing of FrontBuffer rendering
   * logic, etc.<br>
   * Original signature :
   * <code>ovrSensorState ovrHmd_GetSensorState(ovrHmd, double)</code><br>
   * <i>native declaration : OVR_CAPI.h:766</i>
   */
  SensorState.ByValue ovrHmd_GetSensorState(Hmd hmd, double absTime);

  /**
   * Only valid after StartSensor.<br>
   * Original signature :
   * <code>ovrBool ovrHmd_GetSensorDesc(ovrHmd, ovrSensorDesc*)</code><br>
   * <i>native declaration : OVR_CAPI.h:770</i>
   */
  byte ovrHmd_GetSensorDesc(Hmd hmd, SensorDesc descOut);

  /**
   * Fills in description about HMD; this is the same as filled in by
   * ovrHmd_Create.<br>
   * Original signature : <code>void ovrHmd_GetDesc(ovrHmd, ovrHmdDesc*)</code><br>
   * <i>native declaration : OVR_CAPI.h:777</i>
   */
  void ovrHmd_GetDesc(Hmd hmd, HmdDesc desc);

  /**
   * can improve performance.<br>
   * Original signature :
   * <code>ovrSizei ovrHmd_GetFovTextureSize(ovrHmd, ovrEyeType, ovrFovPort, float)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:784</i>
   */
  OvrSizei.ByValue ovrHmd_GetFovTextureSize(Hmd hmd, int eye, FovPort.ByValue fov,
      float pixelsPerDisplayPixel);

  /**
   * Original signature :
   * <code>ovrBool ovrHmd_ConfigureRendering(ovrHmd, const ovrRenderAPIConfig*, unsigned int, const ovrFovPort[2], ovrEyeRenderDesc[2])</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:826</i>
   */
  byte ovrHmd_ConfigureRendering(Hmd hmd, RenderAPIConfig apiConfig, int distortionCaps, FovPort eyeFovIn[],
      EyeRenderDesc eyeRenderDescOut[]);

  /**
   * Original signature :
   * <code>ovrBool ovrHmd_ConfigureRendering(ovrHmd, const ovrRenderAPIConfig*, unsigned int, const ovrFovPort[2], ovrEyeRenderDesc[2])</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:826</i>
   */
  byte ovrHmd_ConfigureRendering(Pointer hmd, RenderAPIConfig apiConfig, int distortionCaps, FovPort eyeFovIn[],
      EyeRenderDesc eyeRenderDescOut[]);

  /**
   * Pass 0 for frame index if not using GetFrameTiming.<br>
   * Original signature :
   * <code>ovrFrameTiming ovrHmd_BeginFrame(ovrHmd, unsigned int)</code><br>
   * <i>native declaration : OVR_CAPI.h:837</i>
   */
  FrameTiming.ByValue ovrHmd_BeginFrame(Hmd hmd, int frameIndex);

  /**
   * *** This Function will to Present/SwapBuffers and potentially wait for GPU
   * Sync ***.<br>
   * Original signature : <code>void ovrHmd_EndFrame(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:843</i>
   */
  void ovrHmd_EndFrame(Hmd hmd);

  /**
   * HmdDesc.EyeRenderOrder[0] first.<br>
   * Original signature :
   * <code>ovrPosef ovrHmd_BeginEyeRender(ovrHmd, ovrEyeType)</code><br>
   * <i>native declaration : OVR_CAPI.h:853</i>
   */
  Posef.ByValue ovrHmd_BeginEyeRender(Hmd hmd, int eye);

  /**
   * be different if a different pose was used for rendering.<br>
   * Original signature :
   * <code>void ovrHmd_EndEyeRender(ovrHmd, ovrEyeType, ovrPosef, ovrTexture*)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:861</i>
   */
  void ovrHmd_EndEyeRender(Hmd hmd, int eye, Posef.ByValue renderPose, Texture eyeTexture);

  /**
   * the game side.<br>
   * Original signature :
   * <code>ovrEyeRenderDesc ovrHmd_GetRenderDesc(ovrHmd, ovrEyeType, ovrFovPort)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:888</i>
   */
  EyeRenderDesc.ByValue ovrHmd_GetRenderDesc(Hmd hmd, int eyeType, FovPort.ByValue fov);

  /**
   * ovrDistortionMesh values will be set to null.<br>
   * Original signature :
   * <code>ovrBool ovrHmd_CreateDistortionMesh(ovrHmd, ovrEyeType, ovrFovPort, unsigned int, ovrDistortionMesh*)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:924</i>
   */
  byte ovrHmd_CreateDistortionMesh(Hmd hmd, int eyeType, FovPort.ByValue fov, int distortionCaps,
      DistortionMesh meshData);

  /**
   * are set to null and zeroes after the call.<br>
   * Original signature :
   * <code>void ovrHmd_DestroyDistortionMesh(ovrDistortionMesh*)</code><br>
   * <i>native declaration : OVR_CAPI.h:931</i>
   */
  void ovrHmd_DestroyDistortionMesh(DistortionMesh meshData);

  /**
   * viewport changes after the fact. This can be used to adjust render size
   * every frame, if desired.<br>
   * Original signature :
   * <code>void ovrHmd_GetRenderScaleAndOffset(ovrFovPort, ovrSizei, ovrRecti, ovrVector2f[2])</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:935</i>
   */
  void ovrHmd_GetRenderScaleAndOffset(FovPort.ByValue fov, OvrSizei.ByValue textureSize,
      OvrRecti.ByValue renderViewport, OvrVector2f uvScaleOffsetOut[]);

  /**
   * with every frame and pass the index to RenderThread for processing.<br>
   * Original signature :
   * <code>ovrFrameTiming ovrHmd_GetFrameTiming(ovrHmd, unsigned int)</code><br>
   * <i>native declaration : OVR_CAPI.h:942</i>
   */
  FrameTiming.ByValue ovrHmd_GetFrameTiming(Hmd hmd, int frameIndex);

  /**
   * pass the same frame index as was used for GetFrameTiming on the main
   * thread.<br>
   * Original signature :
   * <code>ovrFrameTiming ovrHmd_BeginFrameTiming(ovrHmd, unsigned int)</code><br>
   * <i>native declaration : OVR_CAPI.h:947</i>
   */
  FrameTiming.ByValue ovrHmd_BeginFrameTiming(Hmd hmd, int frameIndex);

  /**
   * before this call to reduce latency and ensure proper timing.<br>
   * Original signature : <code>void ovrHmd_EndFrameTiming(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:952</i>
   */
  void ovrHmd_EndFrameTiming(Hmd hmd);

  /**
   * isn't called. Resets internal frame index to the specified number.<br>
   * Original signature :
   * <code>void ovrHmd_ResetFrameTiming(ovrHmd, unsigned int)</code><br>
   * <i>native declaration : OVR_CAPI.h:957</i>
   */
  void ovrHmd_ResetFrameTiming(Hmd hmd, int frameIndex);

  /**
   * Must be called between ovrHmd_BeginFrameTiming & ovrHmd_EndFrameTiming.<br>
   * Original signature :
   * <code>ovrPosef ovrHmd_GetEyePose(ovrHmd, ovrEyeType)</code><br>
   * <i>native declaration : OVR_CAPI.h:962</i>
   */
  Posef.ByValue ovrHmd_GetEyePose(Hmd hmd, int eye);

  /**
   * Must be called on the same thread as ovrHmd_BeginFrameTiming.<br>
   * Original signature :
   * <code>void ovrHmd_GetEyeTimewarpMatrices(ovrHmd, ovrEyeType, ovrPosef, ovrMatrix4f[2])</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:969</i>
   */
  void ovrHmd_GetEyeTimewarpMatrices(Hmd hmd, int eye, Posef.ByValue renderPose,
      OvrMatrix4f twmOut[]);

  /**
   * Must be called on the same thread as ovrHmd_BeginFrameTiming.<br>
   * Original signature :
   * <code>void ovrHmd_GetEyeTimewarpMatrices(ovrHmd, ovrEyeType, ovrPosef, ovrMatrix4f[2])</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:969</i>
   */
  void ovrHmd_GetEyeTimewarpMatrices(Pointer hmd, int eye, Posef.ByValue renderPose,
      OvrMatrix4f twmOut[]);

  /**
   * Used to generate projection from ovrEyeDesc::Fov.<br>
   * Original signature :
   * <code>ovrMatrix4f ovrMatrix4f_Projection(ovrFovPort, float, float, ovrBool)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:978</i>
   */
  OvrMatrix4f.ByValue ovrMatrix4f_Projection(FovPort.ByValue fov, float znear, float zfar, byte rightHanded);

  /**
   * orthoDistance = distance from camera, such as 0.8m<br>
   * Original signature :
   * <code>ovrMatrix4f ovrMatrix4f_OrthoSubProjection(ovrMatrix4f, ovrVector2f, float, float)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:984</i>
   */
  OvrMatrix4f.ByValue ovrMatrix4f_OrthoSubProjection(OvrMatrix4f.ByValue projection, OvrVector2f.ByValue orthoScale,
      float orthoDistance, float eyeViewAdjustX);

  /**
   * value as used in sensor messages.<br>
   * Original signature : <code>double ovr_GetTimeInSeconds()</code><br>
   * <i>native declaration : OVR_CAPI.h:989</i>
   */
  double ovr_GetTimeInSeconds();

  /**
   * Waits until the specified absolute time.<br>
   * Original signature : <code>double ovr_WaitTillTime(double)</code><br>
   * <i>native declaration : OVR_CAPI.h:992</i>
   */
  double ovr_WaitTillTime(double absTime);

  /**
   * be used to clear the screen.<br>
   * Original signature :
   * <code>ovrBool ovrHmd_ProcessLatencyTest(ovrHmd, unsigned char[3])</code><br>
   * <i>native declaration : OVR_CAPI.h:1001</i>
   */
  byte ovrHmd_ProcessLatencyTest(Hmd hmd, ByteBuffer rgbColorOut);

  /**
   * Buffer is valid until next call.<br>
   * Original signature : <code>char* ovrHmd_GetLatencyTestResult(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:1005</i>
   */
  Pointer ovrHmd_GetLatencyTestResult(Hmd hmd);

  /**
   * pixel-read back method (-1 for invalid or N/A)<br>
   * Original signature :
   * <code>double ovrHmd_GetMeasuredLatencyTest2(ovrHmd)</code><br>
   * <i>native declaration : OVR_CAPI.h:1009</i>
   */
  double ovrHmd_GetMeasuredLatencyTest2(Hmd hmd);

  /**
   * Returns defaultValue if property doesn't exist.<br>
   * Original signature :
   * <code>float ovrHmd_GetFloat(ovrHmd, const char*, float)</code><br>
   * <i>native declaration : OVR_CAPI.h:1045</i>
   */
  float ovrHmd_GetFloat(Hmd hmd, String propertyName, float defaultVal);

  /**
   * Modify float property; false if property doesn't exist or is readonly.<br>
   * Original signature :
   * <code>ovrBool ovrHmd_SetFloat(ovrHmd, const char*, float)</code><br>
   * <i>native declaration : OVR_CAPI.h:1048</i>
   */
  byte ovrHmd_SetFloat(Hmd hmd, String propertyName, float value);

  /**
   * Maximum of arraySize elements will be written.<br>
   * Original signature :
   * <code>int ovrHmd_GetFloatArray(ovrHmd, const char*, float[], unsigned int)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:1053</i>
   */
  int ovrHmd_GetFloatArray(Hmd hmd, String propertyName, FloatBuffer values, int arraySize);

  /**
   * Modify float[] property; false if property doesn't exist or is readonly.<br>
   * Original signature :
   * <code>ovrBool ovrHmd_SetFloatArray(ovrHmd, const char*, float[], unsigned int)</code>
   * <br>
   * <i>native declaration : OVR_CAPI.h:1057</i>
   */
  byte ovrHmd_SetFloatArray(Hmd hmd, String propertyName, FloatBuffer values, int arraySize);

  /**
   * String memory is guaranteed to exist until next call to GetString or
   * GetStringArray, or HMD is destroyed.<br>
   * Original signature :
   * <code>char* ovrHmd_GetString(ovrHmd, const char*, const char*)</code><br>
   * <i>native declaration : OVR_CAPI.h:1063</i>
   */
  String ovrHmd_GetString(Hmd hmd, String propertyName, String defaultVal);

  /**
   * Can be used to check existence of a property.<br>
   * Original signature :
   * <code>int ovrHmd_GetArraySize(ovrHmd, const char*)</code><br>
   * <i>native declaration : OVR_CAPI.h:1068</i>
   */
  int ovrHmd_GetArraySize(Hmd hmd, String propertyName);
}
