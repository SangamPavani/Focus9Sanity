#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00004009)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00004009' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00004009->' & $aResult[1] & ')')
EndIf

EndFunc

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---
#comments-start
_WinWaitActivate("Focus-Buyer Price Book - Google Chrome","")
#comments-end
MouseClick("left",822,233,1)
Sleep(1000)
MouseClick("left",803,312,1)
Sleep(1000)
MouseClick("left",564,690,1)
Sleep(1000)
MouseClick("left",928,339,1)
Sleep(1000)
MouseClick("left",976,356,1)
Sleep(1000)
MouseMove(978,356)
Sleep(1000)
MouseDown("left")
Sleep(1000)
MouseMove(438,532)
Sleep(1000)
MouseUp("left")
Sleep(1000)
MouseClick("left",965,378,1)
Sleep(1000)
MouseMove(970,375)
Sleep(1000)
MouseDown("left")
Sleep(1000)
MouseMove(574,534)
Sleep(1000)
MouseUp("left")
Sleep(1000)
MouseClick("left",968,440,1)
Sleep(1000)
MouseMove(974,438)
Sleep(1000)
MouseDown("left")
Sleep(1000)
MouseMove(653,537)
Sleep(1000)
MouseUp("left")
Sleep(1000)
MouseClick("left",954,544,1)
Sleep(1000)
MouseDown("left")
Sleep(1000)
MouseMove(673,533)
Sleep(1000)
MouseUp("left")
Sleep(1000)
MouseClick("left",928,338,1)
Sleep(1000)
MouseClick("left",928,355,1)
Sleep(1000)
MouseMove(969,375)
Sleep(1000)
MouseDown("left")
Sleep(1000)
MouseMove(404,411)
Sleep(1000)
MouseUp("left")
Sleep(1000)
MouseClick("left",969,463,1)
Sleep(1000)
MouseDown("left")
Sleep(1000)
MouseMove(399,450)
Sleep(1000)
MouseUp("left")
Sleep(1000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
