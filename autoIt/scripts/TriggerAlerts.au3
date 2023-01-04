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
_WinWaitActivate("Focus-Configure Transactions - Google Chrome","")
#comments-end
MouseClick("left",469,292,1)
Sleep(2000)
MouseClick("left",483,306,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(667,316)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",474,357,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(791,315)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",466,428,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(862,315)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",476,289,1)
Sleep(2000)
MouseClick("left",455,307,1)
Sleep(2000)
MouseClick("left",472,325,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(938,317)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",469,311,1)
Sleep(2000)
MouseClick("left",462,329,1)
Sleep(2000)
MouseMove(463,344)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(653,352)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",496,399,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(684,355)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",593,472,1)
Sleep(2000)
MouseClick("left",479,316,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(764,334)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",479,419,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(855,336)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseMove(592,614)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(597,644)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",486,605,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(928,333)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",464,620,1)
Sleep(2000)
MouseMove(592,492)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(606,343)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",460,331,1)
Sleep(2000)
MouseClick("left",469,367,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(1000,336)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",486,414,1)
Sleep(2000)
MouseMove(481,414)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(1083,333)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",466,623,1)
Sleep(2000)
MouseMove(465,623)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(655,358)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",593,570,1)
Sleep(2000)
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
